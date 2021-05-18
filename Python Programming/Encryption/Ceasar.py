# 1/19/21

characters = "abcdefghijklmnopqrstuvwxyz .,-#&=+@!?'123456790"


def encrypt_it(sentence, shift):
    if shift > len(characters):
        shift -= len(characters)
    sentence = sentence.lower()
    nums, lets = [], []
    final_product = ""
    for letter in sentence:
        nums.append(characters.find(letter))
    for num in nums:
        num += shift
        if num > len(characters):
            num -= len(characters)
        lets.append(characters[num])
    for letter in lets:
        final_product += letter
    return final_product


def decrypt_it(sentence, shift):
    if shift < 0:
        shift += len(characters)
    sentence = sentence.lower()
    nums, lets = [], []
    final_product = ""
    for letter in sentence:
        nums.append(characters.find(letter))
    for num in nums:
        num -= shift
        if num < 0:
            num += len(characters)
        lets.append(characters[num])
    for letter in lets:
        final_product += letter
    return final_product


def encrypt_it2(sentence, shift):  # Not working. Original implementation
    nums, lets = [], []
    final_product = ""
    for letter in sentence:
        nums.append(ord(letter))
    for num in nums:
        num += shift
        lets.append(chr(num))
    for letter in lets:
        final_product += letter
    return final_product


def decrypt_it2(sentence, shift):  # Not working. Original implementation
    nums, lets = [], []
    final_product = ""
    for letter in sentence:
        nums.append(ord(letter))
    for num in nums:
        num -= shift
        lets.append(chr(num))
    for letter in lets:
        final_product += letter
    return final_product
