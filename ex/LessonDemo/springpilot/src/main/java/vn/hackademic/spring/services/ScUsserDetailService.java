/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import vn.hackademic.spring.bean.ScUserDetail;

/**
 *
 * @author haopv
 */
public class ScUsserDetailService implements UserDetailsService{

    
    @Override
    public UserDetails loadUserByUsername(String usserName) throws UsernameNotFoundException {
        if(!"superadmin".equals(usserName)){
            throw new UsernameNotFoundException("Tai khaon khong ton tai");
        }
        String pass = "333333";
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_ADMIN");
        authorities.add(authority);
        
        ScUserDetail userDetail = new ScUserDetail(usserName, pass, authorities);
        return userDetail;
    }
    
}
