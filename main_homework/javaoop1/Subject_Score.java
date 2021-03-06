package javaoop1;

public class Subject_Score {
	private static String name;
	private String classroom;
	private static String sub1, sub2, sub3, sub4;
	private float s1, s2, s3, s4;
	private String review;

	Subject_Score(String sub1, String sub2, String sub3, String sub4) {
		Subject_Score.sub1 = sub1;
		Subject_Score.sub2 = sub2;
		Subject_Score.sub3 = sub3;
		Subject_Score.sub4 = sub4;
	}

	Subject_Score(float s1, float s2, float s3, float s4) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}

	float getSum() {
		return s1 + s2 + s3 + s4;
	}

	float getAverage() {
		return ((float) (s1 + s2 + s3 + s4)) / 4;
	}
	// ------------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Subject_Score.name = name;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		Subject_Score.sub1 = sub1;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		Subject_Score.sub2 = sub2;
	}

	public String getSub3() {
		return sub3;
	}

	public void setSub3(String sub3) {
		Subject_Score.sub3 = sub3;
	}

	public String getSub4() {
		return sub4;
	}

	public void setSub4(String sub4) {
		Subject_Score.sub4 = sub4;
	}

	public float getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public float getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}

	public float getS3() {
		return s3;
	}

	public void setS3(int s3) {
		this.s3 = s3;
	}

	public float getS4() {
		return s4;
	}

	public void setS4(int s4) {
		this.s4 = s4;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	String getRemark() {
		return review;
	}

	void setRemark(String review) {
		this.review = review;
	}
}
