/*
 * Sent.dm Core API
 * Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: developers@sent.dm
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package dm.sent.client.api;

import dm.sent.client.ApiException;
import dm.sent.client.ApiClient;
import dm.sent.client.ApiException;
import dm.sent.client.Configuration;
import dm.sent.client.model.Customer;
import dm.sent.client.model.CustomersUpdateCustomerRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomersApi
 */
@Disabled
public class CustomersApiTest {

    private static CustomersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CustomersApi(apiClient);
    }

    /**
     * Create a new customer account
     *
     * Creates a new customer account in the Sent platform. This endpoint initializes a new customer profile with basic information and returns the created customer details including generated IDs and credentials for various messaging channels.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomerTest() throws ApiException {
        Customer response = api.createCustomer()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a customer
     *
     * Permanently deletes a customer and all associated data. This action cannot be undone. All active services for this customer will be terminated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomerTest() throws ApiException {
        UUID id = null;
        api.deleteCustomer(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve all customers with pagination
     *
     * Returns a paginated list of all customers. Use page and pageSize parameters to control the number of results returned. Results are sorted by creation date in descending order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCustomersTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        List<Customer> response = api.getAllCustomers(page, pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a customer by ID
     *
     * Returns detailed information about a specific customer including their messaging channel configurations and credentials.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerByIdTest() throws ApiException {
        UUID id = null;
        Customer response = api.getCustomerById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update customer information
     *
     * Updates an existing customer&#39;s information including messaging channel configurations. All fields in the request body will override existing values.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomerTest() throws ApiException {
        UUID id = null;
        String name = null;
        String sendingPhoneNumber = null;
        String smsMessagingProfileId = null;
        String smsBearerToken = null;
        Customer response = api.updateCustomer(id)
                .name(name)
                .sendingPhoneNumber(sendingPhoneNumber)
                .smsMessagingProfileId(smsMessagingProfileId)
                .smsBearerToken(smsBearerToken)
                .execute();
        // TODO: test validations
    }

}