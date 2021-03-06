package com.sumames.sir.service.impl;

import com.sumames.sir.entity.Car;
import com.sumames.sir.entity.Customer;
import com.sumames.sir.entity.Employer;
import com.sumames.sir.entity.Garage;
import com.sumames.sir.entity.Login;
import com.sumames.sir.entity.LoginAccess;
import com.sumames.sir.entity.PurchaseRequest;
import com.sumames.sir.entity.PurchaseRequestDetail;
import com.sumames.sir.entity.Rent;
import com.sumames.sir.entity.RentDetail;
import com.sumames.sir.service.ServiceDao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sutandi
 */
@Service("serviceDao")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class ServiceDaoImpl implements ServiceDao {

    @Autowired
    private SessionFactory sessionFactory;

    public final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional(readOnly = false)
    public boolean save(Object obj) {
        getCurrentSession().saveOrUpdate(obj);
        return true;
    }

    @Override
    @Transactional(readOnly = false)
    public boolean delete(Object obj) {
        getCurrentSession().delete(obj);
        return true;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        Customer t = (Customer) getCurrentSession().get(Customer.class, id);
        return t;
    }

    @Override
    public List<Customer> getCustomers() {
        List<Customer> list = getCurrentSession().createQuery("FROM Customer a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<Customer> getCustomersNotDeleted() {
        List<Customer> list = getCurrentSession().createQuery("FROM Customer a where a.deleteDatetime IS NULL ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Car getCarById(Integer id) {
        Car t = (Car) getCurrentSession().get(Car.class, id);
        return t;
    }

    @Override
    public List<Car> getListCarById(int id) {
        List<Car> list = getCurrentSession().createQuery("from Car where car_garage_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }

    @Override
    public List<Car> getCars() {
        List<Car> list = getCurrentSession().createQuery("FROM Car a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Employer getEmployerById(Integer id) {
        Employer t = (Employer) getCurrentSession().get(Employer.class, id);
        return t;
    }

    @Override
    public List<Employer> getEmployers() {
        List<Employer> list = getCurrentSession().createQuery("FROM Employer a ORDER BY a.recordId ASC").list();
        return list;
    }
    
    @Override
    public List<Employer> getEmployersNotDeleted() {
        List<Employer> list = getCurrentSession().createQuery("FROM Employer a where a.deleteDatetime IS NULL ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Garage getGarageById(Integer id) {
        Garage t = (Garage) getCurrentSession().get(Garage.class, id);
        return t;
    }

    @Override
    public List<Garage> getGarages() {
        List<Garage> list = getCurrentSession().createQuery("FROM Garage a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Login getLoginById(Integer id) {
        Login t = (Login) getCurrentSession().get(Login.class, id);
        return t;
    }

    @Override
    public List<Login> getLogins() {
        List<Login> list = getCurrentSession().createQuery("FROM Login a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Login getByUsername(String username) {
        Login login = (Login) getCurrentSession().createQuery("from Login where username=:userName")
                .setParameter("userName", username)
                .uniqueResult();
        return login;
    }

    @Override
    public LoginAccess getAccessById(Integer id) {
        LoginAccess t = (LoginAccess) getCurrentSession().get(LoginAccess.class, id);
        return t;
    }

    @Override
    public List<LoginAccess> getAccesses() {
        List<LoginAccess> list = getCurrentSession().createQuery("FROM LoginAccess a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public Rent getRentById(Integer id) {
        Rent t = (Rent) getCurrentSession().get(Rent.class, id);
        return t;
    }

    @Override
    public List<Rent> getRents() {
        List<Rent> list = getCurrentSession().createQuery("FROM Rent a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public RentDetail getRentDetailById(Integer id) {
        RentDetail t = (RentDetail) getCurrentSession().get(RentDetail.class, id);
        return t;
    }

    @Override
    public List<RentDetail> getRentDetails() {
        List<RentDetail> list = getCurrentSession().createQuery("FROM RentDetail a ORDER BY a.recordId ASC").list();
        return list;
    }

    @Override
    public List<RentDetail> getListRentById(int id) {
        List<RentDetail> list = getCurrentSession().createQuery("from RentDetail where rent_record_id=:id")
                .setParameter("id", id).list();
        return list;
    }

    @Override
    public PurchaseRequest getPurchaseRequestById(Integer id) {
         PurchaseRequest t = (PurchaseRequest) getCurrentSession().get(PurchaseRequest.class, id);
        return t; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseRequest> getListRequestById(int id) {
      List<PurchaseRequest> list = getCurrentSession().createQuery("from PurchaseRequest where record_id=:id")
                .setParameter("id", id).list();
        return list;
    }

    @Override
    public PurchaseRequestDetail getPurchaseRequestDetailById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseRequestDetail> getListRequestDetailById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseRequest> getRequest() {
      List<PurchaseRequest> list = getCurrentSession().createQuery("FROM PurchaseRequest a ORDER BY a.recordId ASC").list();
        return list;
    }

}
