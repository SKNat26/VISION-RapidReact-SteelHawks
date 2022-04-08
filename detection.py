import cv2 as cv
import numpy as np
import json 

class Detection:
    #opens json file
    f = open("data_V1.json")
    data = json.load(f)

    #class variables
    blue_hsv = [(data["bluehsv"][""])]
    red_hsv = []