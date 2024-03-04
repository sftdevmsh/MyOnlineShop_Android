//package msh.myonlineshop.clients;
//
//import retrofit2.Call;
//import retrofit2.http.GET;
//import retrofit2.http.PUT;
//import retrofit2.http.Path;
//import retrofit2.http.Query;
//
//public interface BlogClient {
//    @GET("blog/getAllData")
//    Call<ServiceResponse<Blog>> getAllData(
//            @Query("pageNumber") int pageNumber,
//            @Query("pageSize") int pageSize
//    );
//
//    @PUT("blog/increaseVisit/{id}")
//    Call<ServiceResponse<Blog>> increaseVisitCount(
//            @Path("id") long id
//    );
//}
