package com.aman.beans;

import java.io.File;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class AadaharCardInfo {
	
	private long aadharNo;
	private String name;
	private float age;
	private String addrs;
	private Date dob;
	private String[] moles;
	private Locale locale;
	private URL LinkedInURL;
	private URI LinkedInURI;
	private File photoPath;
	private char favouriteLetter;
	private char[] favouriteLetters;
	private long[] phones;
	private boolean isHandicapped;
	private Reader fileReader;
	private Pattern pattern;
	private Class curClazz;
	//Current Class
	
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setMoles(String[] moles) {
		this.moles = moles;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public void setLinkedInURL(URL linkedInURL) {
		LinkedInURL = linkedInURL;
	}
	public void setLinkedInURI(URI linkedInURI) {
		LinkedInURI = linkedInURI;
	}
	public void setPhotoPath(File photoPath) {
		this.photoPath = photoPath;
	}
	public void setFavouriteLetter(char favouriteLetter) {
		this.favouriteLetter = favouriteLetter;
	}
	public void setFavouriteLetters(char[] favouriteLetters) {
		this.favouriteLetters = favouriteLetters;
	}
	public void setPhones(long[] phones) {
		this.phones = phones;
	}
	public void setHandicapped(boolean isHandicapped) {
		this.isHandicapped = isHandicapped;
	}
	public void setFileReader(Reader fileReader) {
		this.fileReader = fileReader;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
	public void setCurClazz(Class curClazz) {
		this.curClazz = curClazz;
	}
	
	
	@Override
	public String toString() {
		return "AadaharCardInfo [aadharNo=" + aadharNo + ", name=" + name + ", age=" + age + ", addrs=" + addrs
				+ ", dob=" + dob + ", moles=" + Arrays.toString(moles) + ", locale=" + locale + ", LinkedInURL="
				+ LinkedInURL + ", LinkedInURI=" + LinkedInURI + ", photoPath=" + photoPath + ", favouriteLetter="
				+ favouriteLetter + ", favouriteLetters=" + Arrays.toString(favouriteLetters) + ", phones="
				+ Arrays.toString(phones) + ", isHandicapped=" + isHandicapped + ", fileReader=" + fileReader.markSupported()
				+ ", pattern=" + pattern.matcher("as").matches() + ", curClazz=" + curClazz + "]";
	}
	

}
