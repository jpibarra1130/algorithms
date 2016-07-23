from bisect import bisect_right

number_list_1 = [-9, -8, -1, 1, 17, 18, 25]
number_list_2 = [-9, -8, 0, 1, 17, 18, 25]
number_list_3 = [-9, 0, 0, 9, 17, 18, 25]
number_list_4 = [-9, 0, 0, 10, 17, 18, 25]
number_list_5 = [-9, -1, 9, 10]
number_list_6 = [-2, -2, -1, 4]

def find_3_sum(number_list):

  n1 = 0
  n2 = n1 + 1

  while n2 < len(number_list) and number_list[n2] < 1:
    n1_value = number_list[n1]
    n2_value = number_list[n2]
    n3_value = (n1_value + n2_value) * -1
    i = bisect_right(number_list, n3_value) - 1

    is_found = i < len(number_list) and (i != n1 or i != n2) and (number_list[i] == n3_value)

    if is_found:
      return (n1_value, n2_value, n3_value)
    elif n2_value > 0:
      n1 += 1
      n2 = n1 + 1
    else:
      n2 += 1

  return (-1, -1, -1)

print("number_list: %s, result: %s" % (number_list_1, find_3_sum(number_list_1)))
print("number_list: %s, result: %s" % (number_list_2, find_3_sum(number_list_2)))
print("number_list: %s, result: %s" % (number_list_3, find_3_sum(number_list_3)))
print("number_list: %s, result: %s" % (number_list_4, find_3_sum(number_list_4)))
print("number_list: %s, result: %s" % (number_list_5, find_3_sum(number_list_5)))
print("number_list: %s, result: %s" % (number_list_6, find_3_sum(number_list_6)))
