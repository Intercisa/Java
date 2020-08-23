import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HasRoleGuard } from '@common/modules/permisson/has-role.guard';
import { Role } from '@services/api/contracts';
import { PaymentTypeListComponent } from './payment-type-list/payment-type-list.component';

const paymentTypeRoutes: Routes = [
    {
        path:"ui/masterdata/payment-type",
         component : PaymentTypeListComponent,
         canActivate : [HasRoleGuard],
         data: {roles: [Role.PAYMENT_TYPE_VIEW]}
    }
] 

@NgModule({
    imports:[],
    exports:[RouterModule]
})
export class PaymentTypeRoutingModule {}