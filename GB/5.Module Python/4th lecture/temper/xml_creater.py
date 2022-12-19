from user_interface import temperature_view
from user_interface import wind_speed_view
from user_interface import pressure_view

path_xml = 'GB/5.Module Python/4th lecture/temper/data.xml'

def create(device = 1):
    global path_xml
    xml = '<xml>\n'
    xml += '    <temperature units = "c">{}</tempetarure>\n'\
        .format(temperature_view(device))
    xml += '    <wind_speed units = "m/s">{}</wind_speed>\n'\
        .format(wind_speed_view(device))
    xml += '    <pressure units = "mmHg">{}</pressure>\n'\
        .format(pressure_view(device))
    xml += '</xml>\n'

    with open(path_xml, 'w') as page:
        page.write(xml)

    return xml  