
<div    x-data="{ items: [], adding: false }"
        class="flex flex-col w-full max-w-md px-4 py-8 bg-white rounded-lg shadow mt-10  dark:bg-gray-800 sm:px-6 md:px-8 lg:px-10">
  <div class="self-center mb-6 text-xl font-light text-gray-600 sm:text-2xl dark:text-white">
    Medicament
  </div>
  <div class="mt-8">
    <form action="#" autoComplete="off">

      <div class="flex flex-col mb-2">
        <div class="flex relative ">
          <input type="text" name="codeMedicament" id="sign-in-email" class=" rounded-r-lg flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="code medicament"/>
        </div>
      </div>

      <div class="flex w-full">
        <button type="submit" class="py-2 px-4  bg-blue-600 hover:bg-purple-700 focus:ring-purple-500 focus:ring-offset-purple-200 text-white w-full transition ease-in duration-200 text-center text-base font-semibold shadow-md focus:outline-none focus:ring-2 focus:ring-offset-2  rounded-lg ">
          suivant
        </button>
      </div>

<%--      ajout--%>
      <div class="flex items-center justify-center mt-6">
        <template x-for="item in items" :key="item">
          <div>
            <input  x-text="item" type="text" id="" name="prix" class=" rounded-r-lg flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="prix"/>

            <button @click="items = items.filter(i => i !== item)">DEL</button>
          </div>
        </template>

        <button @click="adding = true">ADD</button>
        <div x-show.transition="adding" @click.away="adding = false">
          <label for="name">Name:</label>
          <input type="text" id="name" x-model="name" @keyup="$refs.ok.disabled = name.length === 0"
                 name="prix" class=" rounded-r-lg flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="prix"/>


          <button @click="adding = false">CANCEL</button>
          <button @click="adding = false; items.push(name); name = ''" x-ref="ok">OK</button>
        </div>
      </div>
    </form>
  </div>

</div>
