package view;

import java.util.List;

import vo.Score_VO;
import vo.Student_VO;

public class RsList {

	private final List<Student_VO> sList;
	private final List<Score_VO> cList;

	public RsList(List<Student_VO> sList, List<Score_VO> cList) {
		this.sList = sList;
		this.cList = cList;
	}

	public List<Student_VO> getsList() {
		return sList;
	}

	public List<Score_VO> getcList() {
		return cList;
	}
}
