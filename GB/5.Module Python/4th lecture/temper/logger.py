from datetime import datetime as dt
from time import time

path_log = 'GB/5.Module Python/4th lecture/temper/log.csv'

def temperature_logger(data):
    global path_log
    time = dt.now().strftime('%H:%M')
    with open(path_log,'a') as file:
        file.write('{};temperature;{}\n'.format(time, data))

def pressure_logger(data):
    global path_log
    time = dt.now().strftime('%H:%M')
    with open(path_log,'a') as file:
        file.write('{};pressure;{}\n'.format(time, data))

def wind_speed_logger(data):
    global path_log    
    time = dt.now().strftime('%H:%M')
    with open(path_log,'a') as file:
        file.write('{};wind_speed;{}\n'.format(time, data))    