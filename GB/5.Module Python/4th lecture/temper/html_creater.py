from user_interface import temperature_view
from user_interface import wind_speed_view
from user_interface import pressure_view

path_html = 'GB/5.Module Python/4th lecture/temper/index.html'
path_html_sec = 'GB/5.Module Python/4th lecture/temper/sec_index.html'

def create(device = 1):
    global path_html
    style = 'style="font-size:30px;"'
    html = '<html>\n  <head></head>\n  <body>\n'
    html += '    <p {}>Temperature: {} c</p>\n'\
        .format(style, temperature_view(device))
    html += '    <p {}>Pressure: {} c</p>\n'\
        .format(style, pressure_view(device))  
    html += '    <p {}>Wind speed: {} c</p>\n'\
        .format(style, wind_speed_view(device))              
    html += '  </body>\n</html>'   

    with open(path_html, 'w') as page:
        page.write(html)

    return html   


def sec_create(data, device = 1):
    global path_html_sec
    temp, press, wind = data
    style = 'style="font-size:30px;"'
    html = '<html>\n  <head></head>\n  <body>\n'
    html += '    <p {}>Temperature: {} c</p>\n'\
        .format(style, temp)
    html += '    <p {}>Pressure: {} c</p>\n'\
        .format(style, press)        
    html += '    <p {}>Wind speed: {} c</p>\n'\
        .format(style, wind)        
    html += '  </body>\n</html>'   

    with open(path_html_sec, 'w') as page:
        page.write(html)

    return data       
