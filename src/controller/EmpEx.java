package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.EmpDao;
import dto.Emp;
import mybatis.MyBatisConnectionFactory;

public class EmpEx {
	public static void main(String[] args) {
		// DB 접속 객체
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		
		// DAO 실제 구현체
		EmpDao empDao = sqlSession.getMapper(EmpDao.class);
		
		System.out.println("-----");
		List<Emp> list = empDao.selectAll();
		for(Emp e : list) {
			System.out.println(e.getEmpNo() + ", " + e.geteName());
		}
		
		Emp emp = new Emp();
		
		System.out.println("-----");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
//		String dateStr = list.
		String dateStr = "2018-04-12";
		Date d = null;
		try {
			// String to Date
			d = format.parse(dateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 원본 Date 형식
		System.out.println("Date Type : " + d);
		
		// Date to String
		System.out.println(format.format(d));
		
//		emp.setEmpNo(6001);
//		emp.seteName("PIZZA");
//		emp.setJob("TEACHER");
//		emp.setMgr(2000);
//		emp.setHiredate("18/04/17");
//		emp.setSal(5000);
//		emp.setComm(1000);
//		emp.setDeptNo(2);
//		
//		empDao.insertEmp(emp);
//		Emp result = empDao.selectByEmpNo(emp);
//		if( result == null ) {
//			sqlSession.rollback();
//			System.out.println("사원정보 삽입 실패");
//		} else {
//			sqlSession.commit();
//			System.out.println("사원정보 삽입 성공");
//		}
//
//		System.out.println("-----");
//		Emp resultEmp = empDao.selectByEmpNo(emp);
//		System.out.println(resultEmp);
//		
//		System.out.println("-----");
//		emp.setEmpNo(1001);
//		empDao.deleteByEmpNo(emp);
//		result = empDao.selectByEmpNo(emp);
//		if( result == null ) {
//			sqlSession.commit();
//			System.out.println("사원정보 삭제 성공");
//		} else {
//			sqlSession.rollback();
//			System.out.println("사원정보 삭제 실패");
//		}
//		
//		System.out.println("-----");
//		list = empDao.selectAll();
//		System.out.println(list);
		
	}
}
