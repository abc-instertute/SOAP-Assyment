/**
 * Student_Service_Impl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serice_impl;

public interface Student_Service_Impl extends java.rmi.Remote {
    public boolean delete(int id) throws java.rmi.RemoteException;
    public boolean insert(int id, java.lang.String name, int age) throws java.rmi.RemoteException;
    public module.Student search(int id) throws java.rmi.RemoteException;
    public module.Student[] findAll() throws java.rmi.RemoteException;
}
