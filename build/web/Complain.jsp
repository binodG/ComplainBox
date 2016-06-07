<form class="form-horizontal" role="form" method="post" action="insertcomplain">
    <div class="form-group">
        <label class="control-label col-sm-2" for="title">Title:</label>
        <div class="col-sm-6">
            <input type="text" name="title" class="form-control" id="title" placeholder="Enter Title" required="required"/>
        </div>
    </div>


    <div class="form-group">
        <label class="control-label col-sm-2" for="description">Description:</label>
        <div class="col-sm-6">
              <textarea rows="5" cols="50" name="description" class="form-control" id="description" placeholder="Enter Description" ></textarea>
        </div>
    </div>


    <div class="form-group">
        <label class="control-label col-sm-2" for="firstname">First Name:</label>
        <div class="col-sm-6">
            <input type="text" name="firstname" class="form-control" id="firstname" placeholder="Enter Firstname" required="required"/>
        </div>
    </div>


    <div class="form-group">
        <label class="control-label col-sm-2" for="lastname">Last Name:</label>
        <div class="col-sm-6">
            <input type="text" name="lastname" class="form-control" id="lastname" placeholder="Enter Last Name" required="required"/>
        </div>
    </div>


    
    <div class="form-group">
        <label class="control-label col-sm-2" for="email">Email:</label>
        <div class="col-sm-6">
            <input type="text" name="email" class="form-control" id="email" placeholder="Enter Email" required="required"/>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-6">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>


</form>
