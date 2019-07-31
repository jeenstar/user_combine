package com.spring.mypage;

import java.util.List;

import com.spring.member.MemberVO;

/**
* @Class Name : MyPageDAO.java
* @Description : 
* @Modification Information
* @
* @  �닔�젙�씪     	  �닔�젙�옄                 �닔�젙�궡�슜
* @ ---------   ---------   -------------------------------
* @ 2019.07.17     �븳�쑀吏�      理쒖큹�깮�꽦
* @author bit 2議�
* @since 2019. 07.01
* @version 1.0
* @see
*
*  Copyright (C) by Bit All right reserved.
*/

public interface MyPageDAO {

	public MemberVO getMember(int id);
	void updateMember(MemberVO memberVO);
	void updatePw(MemberVO memberVO);
	void updateNick(MemberVO memberVO);
	int checkNick(String m_nickname);
	//硫ㅻ쾭�뜲�씠�꽣 媛��졇�삤湲�, �닔�젙�븯湲�, �깉�눜�슂泥��븯湲�
	public String getMemberName(String m_email);	//硫ㅻ쾭 �씠由� 媛��졇�삤湲�
	public int getMemberId(String m_email);		//硫ㅻ쾭 �븘�씠�뵒 媛��졇�삤湲�
	public String getMemberNickname(String m_email);	//硫ㅻ쾭 �땳�꽕�엫 媛��졇�삤湲�
	
	//1:1 臾몄쓽�궡�뿭 由ъ뒪�듃 媛��졇�삤湲�
	public List<OneVO> getQnaList(int id);	//1:1臾몄쓽 由ъ뒪�듃 媛��졇�삤湲�
	
	//1:1 臾몄쓽 �벑濡앺븯湲�, 媛��졇�삤湲�, �닔�젙�븯湲�, �궘�젣�븯湲�
	public int insertQna(OneVO oneVO);	//1:1 臾몄쓽 �벑濡�
	public OneVO getQnaDetail(int qna_no);	//1:1 臾몄쓽 �긽�꽭�젙蹂� 媛��졇�삤湲�
	public int updateQna(OneVO oneVO);	//1:1 臾몄쓽 �긽�꽭�젙蹂� �닔�젙�븯湲�
	public String getMemberNickname(int mml_num);
	

}
