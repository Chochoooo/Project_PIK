package kr.entity.pik;

import java.io.File;

public class Event {
	private int b_seq;
	private String b_title;
	private String b_content;
	private String b_date;
	//null값 가능
	private String b_file;
	// member id FK
	private String m_id;
	private int b_cnt;
	
	public Event() {
		
	}
	public Event(String b_title, String b_content, String m_id) {
		super();
		this.b_title = b_title;
		this.b_content = b_content;
		this.m_id = m_id;
	}
	
	// 글쓰기 insert용 생성자
	public Event(String b_title, String b_content, String b_file, String m_id) {
		super();
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_file = b_file;
		this.m_id = m_id;
	}
	// list나 view select용 생성자 (file 없음)
	public Event(int b_seq, String b_title, String b_content, String b_date, String m_id, int b_cnt) {
		super();
		this.b_seq = b_seq;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_date = b_date;
		this.m_id = m_id;
		this.b_cnt = b_cnt;
	}

	// list나 view select용 생성자 (file 있음)
	public Event(int b_seq, String b_title, String b_content, String b_date, String b_file, String m_id, int b_cnt) {
		super();
		this.b_seq = b_seq;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_date = b_date;
		this.b_file = b_file;
		this.m_id = m_id;
		this.b_cnt = b_cnt;
	}
	public Event(String b_title, String b_content) {
		this.b_title = b_title;
		this.b_content = b_content;
	}
	public int getB_seq() {
		return b_seq;
	}

	public void setB_seq(int b_seq) {
		this.b_seq = b_seq;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_content() {
		return b_content;
	}

	public void setB_content(String b_content) {
		this.b_content = b_content;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public String getB_file() {
		return b_file;
	}

	public void setB_file(String b_file) {
		this.b_file = b_file;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public int getB_cnt() {
		return b_cnt;
	}

	public void setB_cnt(int b_cnt) {
		this.b_cnt = b_cnt;
	}

	@Override
	public String toString() {
		return "EVENT [b_seq=" + b_seq + ", b_title=" + b_title + ", b_content=" + b_content + ", b_date=" + b_date
				+ ", b_file=" + b_file + ", m_id=" + m_id + ", b_cnt=" + b_cnt + "]";
	}
}
	
