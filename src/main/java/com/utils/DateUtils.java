package com.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Description:时间操作工具
 * Date: 2016/7/25 9:19
 * Author: liuzhiyong
 */
public class DateUtils {

	public static final String DEFAULT_FORMAT = "yyyy-MM-dd hh:mm:ss";

	public static final String DEFAULT_FORMAT_14 = "yyyyMMddHHmmss";

	public static final String dtLong = "yyyyMMddHHmmssSSSS";

	/**
	 * 将字符串转换成date
	 *
	 * @param str 格式yyyy-MM-dd hh:mm:ss
	 * @return
	 */
	public static Date toDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_FORMAT);
			Date date = sdf.parse(str);
			return date;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 将字符串转换成date
	 * @param str
	 * @param format 格式
	 * @return
	 */
	public static Date toDate(String str, String format) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Date date = sdf.parse(str);
			return date;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 时间转成字符串,格式yyyy-MM-dd hh:mm:ss
	 * @param date 时间
	 * @return
	 */
	public static String toString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_FORMAT);
		return sdf.format(date);
	}

	/**
	 * 时间转成字符串
	 * @param date 时间
	 * @param format 格式
	 * @return
	 */
	public static String toString(Date date, String format) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * 当前时间加秒
	 * @param seconds 秒数
	 * @return
	 */
	public static Date addSeconds(int seconds) {
		return org.apache.commons.lang3.time.DateUtils.addSeconds(new Date(), seconds);
	}

	/**
	 * 当前时间加分钟
	 *
	 * @param minutes 分钟数
	 * @return
	 */
	public static Date addMinutes(int minutes) {
		return org.apache.commons.lang3.time.DateUtils.addMinutes(new Date(), minutes);
	}

	/**
	 * 当前时间加小时
	 *
	 * @param hours
	 * @return
	 */
	public static Date addHours(int hours) {
		return org.apache.commons.lang3.time.DateUtils.addHours(new Date(),hours);
	}
	/**
	 * 当前时间加天数
	 *
	 * @param day
	 * @return
	 */
	public static Date addDay(int day) {
		return org.apache.commons.lang3.time.DateUtils.addDays(new Date(),day);
	}
	/**
	 * 当前时间加天年
	 *
	 * @param year
	 * @return
	 */
	public static Date addYear(int year) {
		return org.apache.commons.lang3.time.DateUtils.addYears(new Date(),year);
	}

	/**
	 * 昨天开始时间
	 * 格式 :yyyy-MM-dd 01:00:00
	 *
	 * @return
	 */
	public static Date yesterday() {
		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.DATE, -1);

		calendar.set(Calendar.HOUR_OF_DAY, 1);

		calendar.set(Calendar.MINUTE, 0);

		calendar.set(Calendar.SECOND, 0);

		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();
	}

	/**
	 * 十天前
	 *
	 * @return
	 */
	public static Date tenDaysAgo() {

		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.DATE, -10);

		calendar.set(Calendar.HOUR_OF_DAY, 1);

		calendar.set(Calendar.MINUTE, 0);

		calendar.set(Calendar.SECOND, 0);

		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();
	}

	/**
	 * 三天前
	 * @return
	 */
	public static Date threeDaysAgo() {

		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.DATE, -3);

		calendar.set(Calendar.HOUR_OF_DAY, 1);

		calendar.set(Calendar.MINUTE, 0);

		calendar.set(Calendar.SECOND, 0);

		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();
	}

	/**
	 * @return
	 */
	public static Date nextHour() {
		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.HOUR, 1);

		return calendar.getTime();
	}

	/**
	 * 当前时间
	 *
	 * @return
	 */
	public static String now() {
		Date now = new Date();

		return toString(now);
	}

	/**
     * 下次通知时间
	 *
	 * @param number
	 * @return
     */
    public static Date nextTime(Date date, int number) {
	    return null;

//        Calendar calendar = Calendar.getInstance();
//
//        calendar.setTime(date);
//
//        if (number == -1) {
//            calendar.add(Calendar.MINUTE,
//                    Integer.parseInt(PropertiesUtils.NEXTTIMER_CONFIG.getProperty("avg_notify")));
//        }
//
//        if (number == 1) {
//            calendar.add(Calendar.MINUTE,
//                    Integer.parseInt(PropertiesUtils.NEXTTIMER_CONFIG.getProperty("first_notify")));
//        }
//
//        if (number == 2) {
//            calendar.add(Calendar.MINUTE,
//                    Integer.parseInt(PropertiesUtils.NEXTTIMER_CONFIG.getProperty("second_notify")));
//        }
//
//        if (number == 3) {
//            calendar.add(Calendar.MINUTE,
//                    Integer.parseInt(PropertiesUtils.NEXTTIMER_CONFIG.getProperty("third_notify")));
//        }
//
//        if (number == 4) {
//            calendar.add(Calendar.MINUTE,
//                    Integer.parseInt(PropertiesUtils.NEXTTIMER_CONFIG.getProperty("fourth_notify")));
//        }
//
//        if (number >= 5) {
//            calendar.add(Calendar.MINUTE,
//                    Integer.parseInt(PropertiesUtils.NEXTTIMER_CONFIG.getProperty("fifth_notify")));
//        }
//
//        return calendar.getTime();
    }
    
	/**
	 * 获取传入日期参数的后几天
	 *
	 * @param date
	 * @param day
	 * @return
	 */
	public static Date addDay(Date date, int day) {
		return org.apache.commons.lang3.time.DateUtils.addDays(date,day);
	}

}
