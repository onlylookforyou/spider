package com.gs.spider.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 常用日期函数
 * 
 * @author edmond
 *
 */
public class DateUtil {
	/**
	 * 从格式化日期字符串中获取日期
	 * 
	 * @param str
	 *            (默认格式yyyy-MM-dd HH:mm:ss)
	 * @return
	 */
	public static Date toDate(String str) {

		if (null == str || 0 == str.length()) {
			return null;
		}

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 从格式化日期字符串中获取日期
	 * 
	 * @param str
	 * @param formatStr
	 * @return
	 */
	public static Date toDate(String str, String formatStr) {
		if (null == str || 0 == str.length()) {
			return null;
		}

		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 格式化日期
	 * 
	 * @param date
	 * @return String(默认格式:yyyy-MM-dd HH:mm:ss)
	 */
	public static String formatDate(Date date) {
		String formatStr = "yyyy-MM-dd HH:mm:ss";
		return formatDate(date, formatStr);
	}

	/**
	 * 格式化日期
	 * 
	 * @param date
	 * @param formatStr
	 * @return
	 */
	public static String formatDate(Date date, String formatStr) {
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		return format.format(date);
	}
}
