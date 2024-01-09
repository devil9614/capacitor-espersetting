import { registerPlugin } from '@capacitor/core';

import type { CapacitorEsperSettingPlugin } from './definitions';

const CapacitorEsperSetting = registerPlugin<CapacitorEsperSettingPlugin>(
  'Example',
  {
    web: () =>
      import('./web').then(m => new m.CapacitorEsperSettingWebPlugin()),
  },
);

export * from './definitions';
export { CapacitorEsperSetting };
