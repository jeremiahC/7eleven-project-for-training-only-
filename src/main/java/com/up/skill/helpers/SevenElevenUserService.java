package com.up.skill.helpers;

import com.up.skill.models.MyFormModel;
import com.up.skill.models.MyFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

/**
 * Created by nxtlvl on 12/2/2016.
 */
@Service
public class SevenElevenUserService {

//    @Autowired
//    private MyFormRepository myFormRepository;
//
////    @PostConstruct
//    protected void initialize(){
//        save(new MyFormModel("jeremiah","jeremiah@yahoo.com"));
//        save(new MyFormModel("artuyo","artuyo@yahoo.com"));
//    }
//
////    @Transactional
//    public MyFormModel save(MyFormModel myForm) {
//        myFormRepository.save(myForm);
//        return myForm;
//    }
//
//
//    public MyFormModel loadUserByUsername(String username) throws UsernameNotFoundException{
//        MyFormModel account = myFormRepository.findOneByEmail(username);
//        if(account == null){
//            throw new UsernameNotFoundException("user not found");
//        }
//        return createUser(account);
//    }
//
//    private MyFormModel createUser(MyFormModel account) {
//        return new MyFormModel(account.getEmail(), account.getName());
//    }

}
