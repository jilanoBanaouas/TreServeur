package Stb.services;

import org.springframework.beans.factory.annotation.Autowired;

import Stb.model.Sec.Client;

import java.math.BigInteger;
import Stb.dao.SecDao;
import Stb.model.Sec.Role;
import Stb.model.Sec.UserStatus;
import Stb.model.Sec.Users;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class SecServicesImpl implements SecServices {

   @Autowired
    SecDao secDao;

    @Override
    public Client getClient(BigInteger typeP, String login, String pwd) throws Exception {
        return secDao.getClient(typeP, login, pwd);
    }

    @Override
    public Client getClientlogin(String login) throws Exception {
        return secDao.getClientlogin(login);
    }

    @Override
    public List<String> getAbonnmentClient(BigInteger typeP, String login, String pwd) throws Exception {
        return secDao.getAbonnmentClient(typeP, login, pwd);
    }
    
   
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		Users user = secDao.findUserByName(username); //our own User model class
		
		if(user!=null){
			String password = user.getPassword();
			//additional information on the security object
			boolean enabled = user.getStatus().equals(UserStatus.ACTIVE);
			boolean accountNonExpired = user.getStatus().equals(UserStatus.ACTIVE);
			boolean credentialsNonExpired = user.getStatus().equals(UserStatus.ACTIVE);
			boolean accountNonLocked = user.getStatus().equals(UserStatus.ACTIVE);
			
			//Let's populate user roles
			Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			for(Role role : user.getRoles()){
				authorities.add(new GrantedAuthorityImpl(role.getRoleName()));
			}
			
			//Now let's create Spring Security User object
			org.springframework.security.core.userdetails.User securityUser = new 
					org.springframework.security.core.userdetails.User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
			return securityUser;
		}else{
			throw new UsernameNotFoundException("User Not Found!!!");
		}
	}

}
