pm.test("Verify latitude and longitude", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.coord.lat).to.eql(51.51);
    pm.expect(jsonData.coord.lon).to.eql(-0.13);
});

// Test Case 1: Verify that the response has a 200 status code
pm.test("Verify status code is 200", function () {
    pm.response.to.have.status(200);
});

// Test Case 2: Verify that the temperature is returned in Kelvin
pm.test("Verify temperature is in Kelvin", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.main.temp).to.be.a("number");
    pm.expect(jsonData.main.temp).to.be.above(0);
});

// Test Case 3: Verify that the weather description is returned
pm.test("Verify weather description is returned", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.weather[0].description).to.be.a("string");
    pm.expect(jsonData.weather[0].description).to.not.be.empty;
});
