package com.lc150;

import lombok.extern.slf4j.*;

@Slf4j
public class ValidSubstringCount {

  public long validSubstringCount(String word1, String word2) {
    if (word1.length() < word2.length()) {
      return 0;
    }
    int[] cnt = new int[26];

    int need = 0;
    for (int i = 0; i < word2.length(); i++) {
      if (++cnt[word2.charAt(i) - 'a'] == 1) {
        ++need;
      }
    }
    long ans = 0;

    int[] win = new int[26];
    for (int l = 0, r = 0; r < word1.length(); ++r) {
      int c = word1.charAt(r) - 'a';
      if (++win[c] == cnt[c]) {
        --need;
      }
      while (need == 0) {
        c = word1.charAt(l) - 'a';
        if (win[c] == cnt[c]) {
          ++need;
        }
        --win[c];
        ++l;
      }
      ans += l;
    }
    return ans;
  }

  public static void main(String[] args) {
    log.info("统计重新排列后包含另一个字符串的子字符串数目 I:{}", new ValidSubstringCount().validSubstringCount("bcca", "abc"));
  }
}
