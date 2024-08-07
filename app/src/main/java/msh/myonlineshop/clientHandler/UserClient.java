package msh.myonlineshop.clientHandler;

import msh.myonlineshop.models.User;
import msh.myonlineshop.models.base.ServiceResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
//to call defined APIs.
public interface UserClient {
    //user: hossein4 , password: 123
    @POST("user/login")
    Call<ServiceResponse<User>> login(@Body() User data);

    @GET("user/getUserInfo")
    Call<ServiceResponse<User>> getUserInfoFromServer(
            @Header("Authorization") String token
    );
}
