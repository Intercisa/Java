import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { HttpFactory } from '@common/http/http-factory';
import { PaymentType } from '@services/api/contracts';
import { ActiveModelRestProxy } from '@services/base/proxy/active-model-rest.proxy';


const ENDPOINTS = {
    BASE: "/api/paymenttype"
};

@Injectable({
    providedIn: "root"
})
export class PaymentTypeBackend extends ActiveModelRestProxy<PaymentType, PaymentType>{
    constructor(httpClient: HttpClient, httpFactory: HttpFactory){
        super(httpClient, httpFactory, ENDPOINTS.BASE);
    }
}
