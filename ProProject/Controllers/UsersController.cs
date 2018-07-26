using DataAccess;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace ProProject.Controllers
{
    public class UsersController : ApiController
    {
        public IEnumerable<Usr> Get()
        {
            using (MultimediaEntities3 enm=new MultimediaEntities3())
            {
                return enm.Usrs.ToList();
            }
        }
        public HttpResponseMessage Get(int ID)
        {
            using (MultimediaEntities3 en = new MultimediaEntities3())
            {
                var Myuser = en.Usrs.FirstOrDefault(a => a.ID == ID);
                if (Myuser == null)
                {
                    return Request.CreateErrorResponse(HttpStatusCode.NotFound, "Record Not Found");
                }
                else
                {
                    return Request.CreateResponse(HttpStatusCode.OK, Myuser);
                }
            }
        }
        public HttpResponseMessage Post(Usr user)
        {
            using (MultimediaEntities3 en = new MultimediaEntities3())
            {
                try
                {
                    en.Usrs.Add(user);
                    en.SaveChanges();
                    var msg = Request.CreateResponse(HttpStatusCode.OK, user);
                    msg.Headers.Location = new Uri(Request.RequestUri + "/" + user.ID);
                    return msg;



                }
                catch (Exception ex)
                {
                    return Request.CreateErrorResponse(HttpStatusCode.NotFound, ex);

                }



            }
        }
        public HttpResponseMessage Delete(int ID)
        {
            using (MultimediaEntities3 en = new MultimediaEntities3())
            {

                var Myuser = en.Usrs.FirstOrDefault(a => a.ID == ID);
                if (Myuser == null)
                {
                    return Request.CreateErrorResponse(HttpStatusCode.NotFound, "Record Not Found");
                }
                else
                {
                    en.Usrs.Remove(Myuser);
                    en.SaveChanges();
                    return Request.CreateResponse(HttpStatusCode.OK);
                }
            }
        }
        public HttpResponseMessage Put(int ID, Usr user)
        {
            try
            {

                using (MultimediaEntities3 en = new MultimediaEntities3())
                {

                    var Myuser = en.Usrs.FirstOrDefault(a => a.ID == ID);
                    if (Myuser == null)
                    {
                        return Request.CreateErrorResponse(HttpStatusCode.NotFound, "Record Not Found");
                    }
                    else
                    {
                        Myuser.Name = user.Name;
                        Myuser.Password = user.Password;
                        Myuser.Photo = user.Photo;
                        Myuser.Imagepath = user.Imagepath;
                        Myuser.Age = user.Age;
                        Myuser.E_mail = user.E_mail;
                        en.SaveChanges();
                        return Request.CreateResponse(HttpStatusCode.OK, Myuser);
                    }
                }
            }
            catch (Exception ex)
            {

                return Request.CreateErrorResponse(HttpStatusCode.NotFound, ex);

            }
        }
    }
}
