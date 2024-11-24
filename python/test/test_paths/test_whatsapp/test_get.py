# coding: utf-8

"""
    Sent.dm Core API

    Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

    The version of the OpenAPI document: 1.1.0
    Contact: developers@sent.dm
    Created by: https://www.sent.dm/
"""

import unittest
from unittest.mock import patch

import urllib3

import sentdm
from sentdm.paths.whatsapp import get
from sentdm import configuration, schemas, api_client

from .. import ApiTestMixin


class TestWhatsapp(ApiTestMixin, unittest.TestCase):
    """
    Whatsapp unit test stubs
        Retrieve WhatsApp contact information
    """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    response_status = 200




if __name__ == '__main__':
    unittest.main()