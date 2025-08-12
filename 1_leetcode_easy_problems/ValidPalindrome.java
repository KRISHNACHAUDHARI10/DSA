class ValidPalindrome {
  public boolean isPalindrome(String s) {
    int beg = 0, end = s.length() - 1;
    while (beg < end) {
      int left = validChar(s.charAt(beg));
      int right = validChar(s.charAt(end));
      if (left == -1) {
        beg++;
      } else if (right == -1) {
        end--;
      } else if (left != right) {
        return false;
      } else {
        beg++;
        end--;
      }

    }
    return true;
  }

  private int validChar(char c) {
    if (c >= '0' && c <= '9')
      return c;
    if (c >= 'a' && c <= 'z')
      return c;
    if (c >= 'A' && c <= 'Z')
      return c - 'A' + 'a';
    return -1;
  }
}