/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanceServlet;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author ahcogn
 */
public class TraceSessionServletListener implements HttpSessionListener {

    int  number=0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Co Session moi "+ ++number);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Huy Session "+ --number);
//To change body of generated methods, choose Tools | Templates.
    }
}
