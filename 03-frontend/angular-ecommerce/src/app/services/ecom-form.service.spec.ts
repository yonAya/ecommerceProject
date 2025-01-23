import { TestBed } from '@angular/core/testing';

import { EcomFormService } from './ecom-form.service';

describe('EcomFormService', () => {
  let service: EcomFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EcomFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
