/**
 * 
 */
package com.chandrakanth.financesystem.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;

/**
 * @author Chandrakanth
 *
 */
public class DateUtil {

	private static final Logger LOGGER = Logger.getLogger(DateUtil.class);

	/**
	 * 
	 */
	public DateUtil() {
		// TODO Auto-generated constructor stub
	}

	public static String returnCreatedModifiedDateTime(final LocalDateTime localDateTime) {
		try {
			return localDateTime.format(DateTimeFormatter.ofPattern("dd-MMM-YY hh.mm.ss.SSSSSSSSS a"));
		} catch (Exception e) {
			LOGGER.warn("Unable to parse the date,, date may be returned as null....", e);
		}
		return null;
	}

}
