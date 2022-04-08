#credits to SathR12 for circle detection 

from distutils.errors import DistutilsFileError
from tkinter import Frame
from turtle import circle
import cv2 as cv
from cv2 import dilate
from cv2 import MORPH_ERODE
from cv2 import bitwise_and
import numpy as np
import json

f = open("data_V1.json")
data = json.load(f)

def findContours(bw):    
    contours, hierarchies = cv.findContours(bw, cv.RETR_EXTERNAL, cv.CHAIN_APPROX_SIMPLE)
    #if len(contours) == 2:
    #    contours = contours[0] 
    #else:
    #    contours = contours[1]
    
    return contours
    
def blue_mask(image, source):
    hsv = cv.cvtColor(image, cv.COLOR_BGR2HSV)
    lower1 = np.array(data["bluehsv"]["lower1"])
    upper1 = np.array(data["bluehsv"]["upper1"])
    mask = cv.inRange(hsv, lower1, upper1)
    final = cv.bitwise_and(hsv,source, mask=mask)
    return mask

def red_mask(image, source):
    hsv = cv.cvtColor(image, cv.COLOR_BGR2HSV)
    lower1 = np.array(data["redhsv"]["lower1"])
    upper1 = np.array(data["redhsv"]["upper1"])
    lower2 = np.array(data["redhsv"]["lower2"])
    upper2 = np.array(data["redhsv"]["upper2"])
    mask1 = cv.inRange(hsv, lower1, upper1)
    mask2 = cv.inRange(hsv,lower2,upper2)
    mask = mask1+mask2
    final = cv.bitwise_and(hsv, source, mask=mask)
    morphmask = cv.morphologyEx(mask, cv.MORPH_CLOSE, (17,17))
    return morphmask

def findCircles(contours, source, rgb = (0,0,255)):

    for contour in contours:
        (x,y),radius = cv.minEnclosingCircle(contour)
        center = (int(x),int(y))
        radius = int(radius)
        approx = cv.approxPolyDP(contour,0.01*cv.arcLength(contour,True),True)
        area = cv.contourArea(contour)
        if ((len(approx) > 8) and ((3.10 < (area/radius**2) and (area/radius**2)<3.18))):
            cv.circle(source,center,radius,(rgb),4)
       
cap = cv.VideoCapture(0)  

while(True):    
    isTrue,frame = cap.read()
    
    blur = cv.GaussianBlur(frame, (13,13), cv.BORDER_DEFAULT)
    
    morphblue = blue_mask(blur,blur)
    morphred = red_mask(blur,blur)

    contoursblue = findContours(morphblue)
    contoursred = findContours(morphred)

    findCircles(contoursblue, frame, rgb=(255,0,0))
    findCircles(contoursred, frame, rgb=(0,0,255))
    
    cv.imshow('circleblue',  morphblue)
    cv.imshow('circlered', morphred)
    cv.imshow('original', frame)
    if cv.waitKey(1) & 0xFF == ord(' '):
        break

cap.release()
cv.destroyAllWindows()
