/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Server;

import DAO.ProductDAO;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author lcmin
 */
@WebService(serviceName = "SOAP_Service")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SOAP_Service {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "check_Product")
    public boolean check_Product(@WebParam(name = "type") String type, @WebParam(name = "amount") int amount) throws SQLException {
        ProductDAO productDAO = new ProductDAO();
        return productDAO.checkProduct(type, amount);
    }
}
