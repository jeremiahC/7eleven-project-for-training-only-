package com.up.skill.helpers;

import com.up.skill.models.MyFormModel;
import com.up.skill.models.MyFormRepository;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by nxtlvl on 12/2/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class SevenElevenControllerTest {

//    @InjectMocks
//    private SevenElevenUserService accountService = new SevenElevenUserService();
//
//    @Mock
//    private MyFormRepository myFormRepositoryMock;
//
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Test
//    public void intitializeWithTwoDemoUser(){
//        accountService.initialize();
//        verify(myFormRepositoryMock, times(2)).save(any(MyFormModel.class));
//    }
//
//    @Test
//    public void  showUserDetails(){
//        // arrange
//        MyFormModel demoUser = new MyFormModel("user@example.com", "user@example.com");
//        when(myFormRepositoryMock.findOneByEmail("user@example.com")).thenReturn(demoUser);
//
//        // act
//        MyFormModel userDetails = accountService.loadUserByUsername("user@example.com");
//
//        // assert
//        assertThat(demoUser.getName()).isEqualTo(userDetails.getName());
//        assertThat(demoUser.getEmail()).isEqualTo(userDetails.getEmail());
//    }
//
//    @Test
//    public void checkUserEmailIfExist(){
//        // arrange
//        thrown.expect(UsernameNotFoundException.class);
//        thrown.expectMessage("user not found");
//
//        when(myFormRepositoryMock.findOneByEmail("jeremiah@yahoo.com")).thenReturn(null);
//        // act
//        accountService.loadUserByUsername("jeremiah@yahoo.com");
//
//    }
}
