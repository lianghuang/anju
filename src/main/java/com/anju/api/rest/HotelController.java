package com.anju.api.rest;

import com.anju.domain.ReturnMsg;
import com.anju.service.AppFileService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/api/v1")
@Api(value = "hotels", description = "Hotel API")
public class HotelController extends AbstractRestHandler {

    @Autowired
    private AppFileService hotelService;

    @RequestMapping(value = "/usertoken",
            method = RequestMethod.POST,
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "generate UserToken", notes = "Returns the User token")
    public ReturnMsg usertoken( @RequestParam(value = "username") String username,
                                @RequestParam(value = "password") String password,
                                HttpServletRequest request, HttpServletResponse response) {
        //TODO generate user token
        return null;
    }

    @RequestMapping(value = "/uploadtoken",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "", notes = "")
    @ResponseBody
    public ReturnMsg uploadtoken(HttpServletRequest request, HttpServletResponse response) {
        //TODO generate user token
       String usertoken= request.getHeader("usertoken");
       if(!StringUtils.isEmpty(usertoken)){

       }else{

       }
        return null;
    }


    @RequestMapping(value = "/callback",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "", notes = "")
    @ResponseBody
    public void callback( @RequestParam(value = "name") String fileName,
                               @RequestParam(value = "hash") String fileHash,
                               @RequestParam(value = "userId") String userId,
                               @RequestParam(value = "location") String location,
            HttpServletRequest request, HttpServletResponse response) {
        //TODO

    }
    @RequestMapping(value = "/promo/list",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "", notes = "")
    @ResponseBody
    public void getPromoList( @RequestParam(value = "page") int page,
                              @RequestParam(value = "size") int size,
                              HttpServletRequest request, HttpServletResponse response) {
        //TODO

    }
    @RequestMapping(value = "/chose/list",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "", notes = "")
    @ResponseBody
    public void getChoseList( @RequestParam(value = "page") int page,
                          @RequestParam(value = "size") int size,
                          HttpServletRequest request, HttpServletResponse response) {
        //TODO

    }
//    public
//    Page<Hotel> getAllHotel(@RequestParam(value = "page", required = true, defaultValue = DEFAULT_PAGE_NUM) Integer page,
//                                      @ApiParam(value = "Tha page size", required = true)
//                                      @RequestParam(value = "size", required = true, defaultValue = DEFAULT_PAGE_SIZE) Integer size,
//                                      HttpServletRequest request, HttpServletResponse response) {
//        return this.hotelService.getAllHotels(page, size);
//    }

//    @RequestMapping(value = "/{id}",
//            method = RequestMethod.GET,
//            produces = {"application/json", "application/xml"})
//    @ResponseStatus(HttpStatus.OK)
//    @ApiOperation(value = "Get a single hotel.", notes = "You have to provide a valid hotel ID.")
//    public
//    @ResponseBody
//    Hotel getHotel(@ApiParam(value = "The ID of the hotel.", required = true)
//                             @PathVariable("id") Long id,
//                             HttpServletRequest request, HttpServletResponse response) throws Exception {
//        Hotel hotel = this.hotelService.getHotel(id);
//        checkResourceFound(hotel);
//        return hotel;
//    }
//
//    @RequestMapping(value = "/{id}",
//            method = RequestMethod.PUT,
//            consumes = {"application/json", "application/xml"},
//            produces = {"application/json", "application/xml"})
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @ApiOperation(value = "Update a hotel resource.", notes = "You have to provide a valid hotel ID in the URL and in the payload. The ID attribute can not be updated.")
//    public void updateHotel(@ApiParam(value = "The ID of the existing hotel resource.", required = true)
//                                 @PathVariable("id") Long id, @RequestBody Hotel hotel,
//                                 HttpServletRequest request, HttpServletResponse response) {
//        checkResourceFound(this.hotelService.getHotel(id));
//        if (id != hotel.getId()) throw new DataFormatException("ID doesn't match!");
//        this.hotelService.updateHotel(hotel);
//    }
//
//    @RequestMapping(value = "/{id}",
//            method = RequestMethod.DELETE,
//            produces = {"application/json", "application/xml"})
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @ApiOperation(value = "Delete a hotel resource.", notes = "You have to provide a valid hotel ID in the URL. Once deleted the resource can not be recovered.")
//    public void deleteHotel(@ApiParam(value = "The ID of the existing hotel resource.", required = true)
//                                 @PathVariable("id") Long id, HttpServletRequest request,
//                                 HttpServletResponse response) {
//        checkResourceFound(this.hotelService.getHotel(id));
//        this.hotelService.deleteHotel(id);
//    }
}
