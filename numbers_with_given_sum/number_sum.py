def find_sum(number_list, s):

  index1 = 0
  index2 = len(number_list) - 1
  result = -1

  while index1 != index2:
    num1 = number_list[index1]
    num2 = number_list[index2]

    sum = num1 + num2

    if sum < s:
      index1 += 1

    if sum > s:
      index2 -= 1

    if sum == s:
      print("Found!")
      result = num1, num2
      break

  return result

number_list = [1, 2, 3, 4, 5]
s = 4

print(find_sum(number_list, s))