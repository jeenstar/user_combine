package com.spring.mml;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mypage.MyPageDAO;

@Service("mmlService")
public class MmlServiceImpl implements MmlService {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private MmlDAO mmlDAO;
	
	@Override
	public List<Mml_ContentVO> getMmlList(){
		MmlDAO mmlDAO = sqlSession.getMapper(MmlDAO.class);
		List<Mml_ContentVO> mmlList = mmlDAO.getMmlList();
		
		return mmlList;
	}
	
	@Override
	public List<Mml_ContentVO> getMmlList_like(){
		MmlDAO mmlDAO = sqlSession.getMapper(MmlDAO.class);
		List<Mml_ContentVO> mmlList = mmlDAO.getMmlList_like();
		
		return mmlList;
	}
	
	@Override
	public List<Mml_ContentVO> getMmlList_user(int id){
		MmlDAO mmlDAO = sqlSession.getMapper(MmlDAO.class);
		List<Mml_ContentVO> mmlList = mmlDAO.getMmlList_user(id);
		
		return mmlList;
	}
	
	@Override
	public String getMemberNickname(String m_email) {
		MyPageDAO mypageDAO = sqlSession.getMapper(MyPageDAO.class);
		String m_nickname = mypageDAO.getMemberNickname(m_email);
		
		return m_nickname;
	}
	
	@Override
	public String getMmlNickname(int id) {
		MmlDAO mmlDAO = sqlSession.getMapper(MmlDAO.class);
		String m_nickname = mmlDAO.getMmlNickname(id);
		return m_nickname;
	}
	
	@Override
	public String getMemberName(String m_email) {
		MyPageDAO mypageDAO = sqlSession.getMapper(MyPageDAO.class);
		String m_name = mypageDAO.getMemberName(m_email);
		return m_name;
	}
	
	@Override
	public int getMemberId(String m_email) {
		MyPageDAO mypageDAO = sqlSession.getMapper(MyPageDAO.class);
		int id = mypageDAO.getMemberId(m_email);
		return id;
	}
	
	public int getMmlId(int mml_num) {
		MmlDAO mmlDAO = sqlSession.getMapper(MmlDAO.class);
		int id = mmlDAO.getMmlId(mml_num);
		return id;
	}
}
