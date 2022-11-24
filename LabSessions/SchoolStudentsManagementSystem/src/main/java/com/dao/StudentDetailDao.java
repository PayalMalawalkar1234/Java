package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.HibernateUtil;

public class StudentDetailDao {
	// Create
	// Save course method
	public void saveCourse(StudentDetailDao course) {
		// no transaction has been started
		Transaction transaction = null;
		// creating a session for e.g visiting a ATM is a session and there we will be
		// performing transactions
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// save course object
			session.save(course);

			// commit the transaction
			transaction.commit();
			System.out.println("Course saved");
		}
		// if any exception
		catch (Exception e) {
			if (transaction != null) {
				// undo work done in the correct transaction
				transaction.rollback();
			}
		}
	}

	// Read
	// Get single course method
	public StudentDetailDao getCourseById(long id) {
		// no transaction has been started
		Transaction transaction = null;
		// declare a course object to store the course that we will get by using the
		// id
		StudentDetailDao course = null;
		// creating a session for e.g visiting a ATM is a session and there we will be
		// performing transactions
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// getting course by id and storing course
			course = session.get(StudentDetailDao.class, id);

			// commit the transaction
			transaction.commit();
		}
		// if any exception
		catch (Exception e) {
			if (transaction != null) {
				// undo work done in the correct transaction
				transaction.rollback();
			}
		}

		return course;
	}

	// Get all course method
	public List<StudentDetailDao> getAllCourse() {
		// no transaction has been started
		Transaction transaction = null;
		// list of courses is empty
		List<StudentDetailDao> courses = null;
		// creating a session for e.g visiting a ATM is a session and there we will be
		// performing transactions
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// getting all courses
			courses = session.createQuery("from Course").list();

			// commit the transaction
			transaction.commit();
		}
		// if any exception
		catch (Exception e) {
			if (transaction != null) {
				// undo work done in the correct transaction
				transaction.rollback();
			}
		}

		return courses;
	}

	// Update
	// Update course method
	public void updateCourse(StudentDetailDao course) {
		// no transaction has been started
		Transaction transaction = null;
		// creating a session for e.g visiting a ATM is a session and there we will be
		// performing transactions
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// save or update course object
			session.saveOrUpdate(course);

			// commit the transaction
			transaction.commit();
			System.out.println("Course updated");
		}
		// if any exception
		catch (Exception e) {
			if (transaction != null) {
				// undo work done in the correct transaction
				transaction.rollback();
			}
		}
	}

	// Delete
	// Delete a course method
	public void deleteCourse(long id) {
		// no transaction has been started
		Transaction transaction = null;
		// declare a course object to store the course that we will get by using the
		// id
		StudentDetailDao course = null;
		// creating a session for e.g visiting a ATM is a session and there we will be
		// performing transactions
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// getting course by id and storing course
			course = session.get(StudentDetailDao.class, id);

			// delete that course
			session.delete(course);

			// commit the transaction
			transaction.commit();

			System.out.println("Course delete");
		}
		// if any exception
		catch (Exception e) {
			if (transaction != null) {
				// undo work done in the correct transaction
				transaction.rollback();
			}
		}

	}
}
