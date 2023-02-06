import data_provider as data
import logger as log

def temperature_view(sensor):
    temp_data = data.get_temperature(sensor)
    log.temperature_logger(temp_data)
    return temp_data

def pressure_view(sensor):
    press_data = data.get_pressure(sensor)
    log.pressure_logger(press_data)
    return press_data

def wind_speed_view(sensor):
    wind_data = data.get_wind_speed(sensor)
    log.wind_speed_logger(wind_data)
    return wind_data    