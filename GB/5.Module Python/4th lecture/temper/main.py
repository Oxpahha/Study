import html_creater
import xml_creater
import data_provider

print(html_creater.create())
print(xml_creater.create())

html_creater.sec_create(xml_creater.sec_create(data_provider.data_collection()))


