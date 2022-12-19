from user_interface import temperature_view
from user_interface import wind_speed_view
from user_interface import pressure_view

path_xml = 'GB/5.Module Python/4th lecture/temper/data.xml'
path_xml_sec = 'GB/5.Module Python/4th lecture/temper/sec_data.xml'

def create(device = 1):
    global path_xml
    xml = '<xml>\n'
    xml += '    <temperature units = "c">{}</tempetarure>\n'\
        .format(temperature_view(device))
    xml += '    <pressure units = "mmHg">{}</pressure>\n'\
        .format(pressure_view(device))        
    xml += '    <wind_speed units = "m/s">{}</wind_speed>\n'\
        .format(wind_speed_view(device))
    xml += '</xml>\n'

    with open(path_xml, 'w') as page:
        page.write(xml)
    return xml  


def sec_create(data ,device = 1):
    global path_xml_sec
    temp, press, wind = data
    temp = temp*1.8+32
    xml = '<xml>\n'
    xml += '    <temperature units = "f">{}</tempetarure>\n'\
        .format(temp)
    xml += '    <pressure units = "mmHg">{}</pressure>\n'\
        .format(press)
    xml += '    <wind_speed units = "m/s">{}</wind_speed>\n'\
        .format(wind)        
    xml += '</xml>\n'

    with open(path_xml_sec, 'w') as page:
        page.write(xml)
    return data      