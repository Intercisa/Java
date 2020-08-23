import { Injectable } from '@angular/core';
import { PaymentType } from '@services/api/contracts';
import { ActiveModelRestService } from '@services/base/service/active-model-rest-service';
import { PaymentTypeBackend } from './payment-type.backend';

@Injectable({
  providedIn: 'root'
})
export class PaymentTypeService extends ActiveModelRestService<PaymentType, PaymentType> {

  constructor( backend:PaymentTypeBackend ) {  super(backend)}
}
