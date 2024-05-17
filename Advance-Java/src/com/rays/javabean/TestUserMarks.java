package com.rays.javabean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.rays.userjdbc.UserModel;

public class TestUserMarks {
	public static void main(String[] args) throws Exception {

//		testAdd();
//		testUpdate();
//		testDelete();
		testSearch();
//		testGet();
//		testGetMeritList();

	}

	private static void testGetMeritList() throws Exception {
		UserMarks marks = new UserMarks();
		List<UserJavaBean> meritList = marks.getMeritList();

		if (meritList != null && !meritList.isEmpty()) {
			System.out.println("Merit List:");
			for (UserJavaBean bean : meritList) {
				System.out.println(
						bean.getId() + " " + bean.getFirstName() + " " + bean.getLastName() + " " + bean.getRollNo()
								+ " " + bean.getChemistry() + " " + bean.getPhysics() + " " + bean.getMaths());
			}
		} else {
			System.out.println("No user marks found in merit list.");
		}
	}

	private static void testGet() throws Exception {
		UserMarks marks = new UserMarks();
		int id = 5;
		UserJavaBean bean = marks.get(id);

		if (bean != null) {
			System.out.println(bean.getId() + " " + bean.getFirstName() + " " + bean.getLastName() + " "
					+ bean.getRollNo() + " " + bean.getChemistry() + " " + bean.getPhysics() + " " + bean.getMaths());
		} else {
			System.out.println("No user mark found with ID " + id);
		}
	}

	private static void testSearch() throws Exception {
        UserMarks marks = new UserMarks();
        List<UserJavaBean> list = marks.search();

        if (list != null && !list.isEmpty()) {
            for (UserJavaBean bean : list) {
                System.out.println(bean.getId() + " " + bean.getFirstName() + " " + bean.getLastName()
                        + " " + bean.getRollNo() + " " + bean.getChemistry() + " " + bean.getPhysics() + " " + bean.getMaths());
            }
        } else {
            System.out.println("No user marks found.");
        }
    }

	private static void testDelete() throws Exception {
		UserMarks marks = new UserMarks();
		int d = 5;
		marks.delete(d);
	}

	private static void testUpdate() throws Exception {
		UserMarks marks = new UserMarks();
		int i = 8;
		marks.update(i);

	}

	private static void testAdd() throws Exception {
		UserJavaBean beans = new UserJavaBean();
		UserMarks marks = new UserMarks();

		beans.setFirstName("Shivay");
		beans.setLastName("Prajapati");
		beans.setRollNo(109);
		beans.setChemistry(80);
		beans.setPhysics(85);
		beans.setMaths(90);

		marks.add(beans);
	}

}