package com.gs.spider.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 计算相似度工具类
 * 
 * @author lyhcc
 * @version 2017/3/14
 */
public class CalcSimilarityUtil {

	/**
	 * 两个字符串相似度比较
	 * 
	 * @param strA
	 * @param strB
	 * @return
	 */
	public static double calcStringSimilarity(String strA, String strB) {

		if (StringUtils.isBlank(strA) || StringUtils.isBlank(strB)) {
			return 0;
		}
		// 只保留字符串中的汉字，字母和数字
		String newStrA = removeSign(strA);
		String newStrB = removeSign(strB);

		if (StringUtils.isBlank(newStrA) || StringUtils.isBlank(newStrB)) {
			return 0;
		}

		int length = Math.max(newStrA.length(), newStrB.length());
		int similarityCount = countSimilarity(newStrA, newStrB);
		return similarityCount * 1.0 / length;
	}

	private static String removeSign(String str) {

		StringBuffer sb = new StringBuffer();
		for (char item : str.toCharArray())
			if (charReg(item)) {
				sb.append(item);
			}
		return sb.toString();
	}

	// 判断是否是汉字（unicode范围：0x4E00-0X9FA5），字母，数字
	private static boolean charReg(char charValue) {

		return (charValue >= 0x4E00 && charValue <= 0X9FA5) || (charValue >= 'a' && charValue <= 'z')
				|| (charValue >= 'A' && charValue <= 'Z') || (charValue >= '0' && charValue <= '9');
	}

	private static int countSimilarity(String strA, String strB) {

		StringBuilder result = new StringBuilder();
		while (!strA.equals("")) {
			String subs = strA.substring(0, 1);
			strA = strA.replaceFirst(subs, "");
			int length = strB.length();
			strB = strB.replaceFirst(subs, "");
			if (strB.length() < length)
				result.append(subs);
		}
		return result.length();
	}
}
