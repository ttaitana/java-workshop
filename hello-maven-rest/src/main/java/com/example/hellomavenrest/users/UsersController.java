package com.example.hellomavenrest.users;

import com.example.hellomavenrest.employee.EmployeeResponse;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @GetMapping("/users")
    public UsersResponse[] getAllUsers() {
        UsersResponse[] response = new UsersResponse[]{this.generateUsersMock1(), this.generateUsersMock2()};
        return response;
    }

    @GetMapping("/users/{id}")
    public UsersResponse getUser(@PathVariable String id){
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e) {
            System.out.println("Invalid type of id");
            return null;
        }
        if(_id == 1){
            return this.generateUsersMock1();
        }
        if (_id == 2){
            return this.generateUsersMock2();
        }
        return null;
    }


    //  ! Mocking User Data
    private UsersResponse generateUsersMock1() {
        Geo userGeo = new Geo("-37.3159", "81.1496");
        Address userAddress = new Address("92998-3874", userGeo, "Apt. 556", "Gwenborough", "Kulas Light");
        Company userCompany = new Company("harness real-time e-markets", "Multi-layered client-server neural-net", "Romaguera-Crona");
        return new UsersResponse("hildegard.org", userAddress, "1-770-736-8031 x56442", "Leanne Graham", userCompany, 1, "Sincere@april.biz", "Bret");
    }

    private UsersResponse generateUsersMock2() {
        Geo userGeo = new Geo("-43.9509","-34.4618");
        Address userAddress = new Address("90566-7771", userGeo, "Suite 879", "Wisokyburgh", "Victor Plains");
        Company userCompany = new Company("synergize scalable supply-chains", "Proactive didactic contingency", "Deckow-Crist");
        return new UsersResponse("anastasia.net", userAddress, "010-692-6593 x09125", "Ervin Howell", userCompany, 2, "Shanna@melissa.tv", "Antonette");
    }
}
