package serice_impl;

public class Student_Service_ImplProxy implements serice_impl.Student_Service_Impl {
  private String _endpoint = null;
  private serice_impl.Student_Service_Impl student_Service_Impl = null;
  
  public Student_Service_ImplProxy() {
    _initStudent_Service_ImplProxy();
  }
  
  public Student_Service_ImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initStudent_Service_ImplProxy();
  }
  
  private void _initStudent_Service_ImplProxy() {
    try {
      student_Service_Impl = (new serice_impl.Student_Service_ImplServiceLocator()).getStudent_Service_Impl();
      if (student_Service_Impl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)student_Service_Impl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)student_Service_Impl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (student_Service_Impl != null)
      ((javax.xml.rpc.Stub)student_Service_Impl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public serice_impl.Student_Service_Impl getStudent_Service_Impl() {
    if (student_Service_Impl == null)
      _initStudent_Service_ImplProxy();
    return student_Service_Impl;
  }
  
  public boolean delete(int id) throws java.rmi.RemoteException{
    if (student_Service_Impl == null)
      _initStudent_Service_ImplProxy();
    return student_Service_Impl.delete(id);
  }
  
  public boolean insert(int id, java.lang.String name, int age) throws java.rmi.RemoteException{
    if (student_Service_Impl == null)
      _initStudent_Service_ImplProxy();
    return student_Service_Impl.insert(id, name, age);
  }
  
  public module.Student search(int id) throws java.rmi.RemoteException{
    if (student_Service_Impl == null)
      _initStudent_Service_ImplProxy();
    return student_Service_Impl.search(id);
  }
  
  
}