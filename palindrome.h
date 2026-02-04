// palindrome.h
#ifndef PALINDROME_H
#define PALINDROME_H

#include <string> // Required for std::string

/**
 * @brief Checks if a given string is a palindrome.
 *
 * This function considers a string a palindrome if it reads the same forwards
 * and backwards, ignoring case and non-alphanumeric characters.
 *
 * @param s The input string to check.
 * @return true if the string is a palindrome, false otherwise.
 */
bool isPalindrome(const std::string& s);

#endif // PALINDROME_H