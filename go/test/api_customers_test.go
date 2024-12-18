/*
Sent.dm Core API

Testing CustomersApiService

*/

// Code generated by Konfig (https://konfigthis.com);

package sentdm

import (
    "testing"
    // "github.com/stretchr/testify/assert"
    // "github.com/stretchr/testify/require"
    // sentdm "github.com/sentdm/sent-sdks/go"
)

func Test_sentdm_CustomersApiService(t *testing.T) {

    // configuration := sentdm.NewConfiguration()
    // configuration.SetHost("http://127.0.0.1:4010")
    /* 
    configuration.SetApiKey("X_API_KEY")
    client := sentdm.NewAPIClient(configuration)
    */

    t.Run("Test CustomersApiService CreateCustomer", func(t *testing.T) {
        /* TODO: ENG-1367 Fix parameter values for Go SDK generated tests
        
        body := *sentdm.Newstring()
        
        request := client.CustomersApi.CreateCustomer(
            "Acme Corp",
        )
        
        resp, httpRes, err := request.Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)
        */
    })

    t.Run("Test CustomersApiService DeleteCustomer", func(t *testing.T) {
        /* TODO: ENG-1367 Fix parameter values for Go SDK generated tests
        request := client.CustomersApi.DeleteCustomer(
            ""38400000-8cf0-11bd-b23e-10b96e4ef00d"",
        )
        
        resp, httpRes, err := request.Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)
        */
    })

    t.Run("Test CustomersApiService GetAllCustomers", func(t *testing.T) {
        /* TODO: ENG-1367 Fix parameter values for Go SDK generated tests
        request := client.CustomersApi.GetAllCustomers(
            1,
            20,
        )
        
        resp, httpRes, err := request.Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)
        */
    })

    t.Run("Test CustomersApiService GetCustomerById", func(t *testing.T) {
        /* TODO: ENG-1367 Fix parameter values for Go SDK generated tests
        request := client.CustomersApi.GetCustomerById(
            ""38400000-8cf0-11bd-b23e-10b96e4ef00d"",
        )
        
        resp, httpRes, err := request.Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)
        */
    })

    t.Run("Test CustomersApiService UpdateCustomer", func(t *testing.T) {
        /* TODO: ENG-1367 Fix parameter values for Go SDK generated tests
        
        customersUpdateCustomerRequest := *sentdm.NewCustomersUpdateCustomerRequest()
        customersUpdateCustomerRequest.SetName("null")
        customersUpdateCustomerRequest.SetSendingPhoneNumber("null")
        customersUpdateCustomerRequest.SetSmsMessagingProfileId("null")
        customersUpdateCustomerRequest.SetSmsBearerToken("null")
        
        request := client.CustomersApi.UpdateCustomer(
            ""38400000-8cf0-11bd-b23e-10b96e4ef00d"",
            customersUpdateCustomerRequest,
        )
        
        resp, httpRes, err := request.Execute()

        require.Nil(t, err)
        require.NotNil(t, resp)
        assert.Equal(t, 200, httpRes.StatusCode)
        */
    })

}