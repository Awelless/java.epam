package com.awelless;

import java.util.ArrayList;
import java.util.Date;

public class Calendar {

	private ArrayList<SpecialDay> specialDays;

	Calendar() {
		specialDays = new ArrayList<SpecialDay>();
	}

	public void addSpecialDay(String date, String title) {
		specialDays.add(new SpecialDay(date, title));
	}

	public void removeSpecialDay(String date) {

		for (SpecialDay specialDay : specialDays) {
			if(specialDay.date == date) {
				specialDays.remove(specialDay);
				break;
			}
		}
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		for (SpecialDay specialDay : specialDays) {
			builder.append(specialDay + "\n");
		}

		return builder.toString();
	}

	private static class SpecialDay {

		private String date, title;

		private SpecialDay(String date, String title) {
			this.date  = date;
			this.title = title;
		}

		@Override
		public String toString() {
			return date + " - " + title;
		}
	}

}
