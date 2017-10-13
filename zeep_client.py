import zeep

wsdl = 'http://localhost:8080/CalculatorWS/CalculatorWS?wsdl'
client = zeep.Client(wsdl=wsdl)

i = 10
j = 2

result = client.service.add(i, j)  # 10 + 2 = 12
print("{} + {} = {}".format(i, j, result))

result = client.service.subtraction(i, j)  # 10 - 2 = 8
print("{} - {} = {}".format(i, j, result))

result = client.service.multiply(i, j)  # 10 * 2 = 20
print("{} * {} = {}".format(i, j, result))

result = client.service.divide(i, j)  # 10 / 2 = 5
print("{} / {} = {}".format(i, j, result))
