package com.amazonaws.mws.model;

/*
 * Enumeration of valid content types for a feed submission.
 */
public enum ContentType {

	OctetStream("application/octet-stream", null),
	TextTabIso8859("text/tab-separated-values", "charset=iso-8859-1"),
	TextTabShiftJis("text/tab-separated-values", "charset=Shift_JIS"),
	TextTabUtf8("text/tab-separated-values", "charset=UTF-8"),
	TextTabUtf16("text/tab-separated-values", "charset=UTF-16"),
	TextXml("text/xml", null);

	private String mediaType;
	private String charSet;

	private ContentType(String mediaType, String charSet) {
		this.mediaType = mediaType;
		this.charSet = charSet;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.mediaType);

		if(charSet != null) {
			sb.append(";").append(charSet);
		}

		return sb.toString();
	}
}

